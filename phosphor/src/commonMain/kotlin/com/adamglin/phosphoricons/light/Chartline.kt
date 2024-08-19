package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Chartline: ImageVector
    get() {
        if (_chartline != null) {
            return _chartline!!
        }
        _chartline = Builder(name = "Chartline", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                verticalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(98.78f)
                lineToRelative(54.05f, -47.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.55f, -0.28f)
                lineToRelative(60.11f, 45.08f)
                lineToRelative(60.34f, -52.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.9f, 9.0f)
                lineToRelative(-64.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.55f, 0.28f)
                lineTo(96.29f, 111.72f)
                lineTo(38.0f, 162.72f)
                verticalLineTo(202.0f)
                horizontalLineTo(224.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 208.0f)
                close()
            }
        }
        .build()
        return _chartline!!
    }

private var _chartline: ImageVector? = null
