package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.0f, 157.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.07f, 0.0f)
                lineToRelative(-48.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 6.6f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -6.6f)
                close()
                moveTo(88.7f, 212.0f)
                lineTo(128.0f, 166.15f)
                lineTo(167.3f, 212.0f)
                close()
                moveTo(228.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 44.0f)
                horizontalLineTo(208.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 64.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
