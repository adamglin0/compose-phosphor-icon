package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.15f, 210.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.15f, -13.12f)
                lineToRelative(40.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.29f, 0.0f)
                close()
                moveTo(208.0f, 40.0f)
                horizontalLineTo(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(68.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.07f, -1.44f)
                lineToRelative(38.28f, -45.92f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 21.0f, -8.51f)
                arcToRelative(24.68f, 24.68f, 0.0f, false, true, 16.25f, 8.94f)
                lineToRelative(37.91f, 45.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.07f, 1.44f)
                horizontalLineTo(208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(64.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
