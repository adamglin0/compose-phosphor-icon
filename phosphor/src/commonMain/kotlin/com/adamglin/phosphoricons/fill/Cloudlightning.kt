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

public val FillGroup.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = Builder(name = "CloudLightning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 168.0f)
                horizontalLineTo(132.53f)
                lineToRelative(-14.4f, 24.0f)
                horizontalLineTo(144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.86f, 12.12f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.72f, -8.24f)
                lineTo(129.87f, 208.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.86f, -12.12f)
                lineTo(113.87f, 168.0f)
                horizontalLineToRelative(-37.0f)
                curveTo(48.12f, 168.0f, 24.2f, 145.07f, 24.0f, 116.36f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 61.35f, 66.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 4.78f)
                arcTo(92.48f, 92.48f, 0.0f, false, false, 64.0f, 87.39f)
                arcTo(8.14f, 8.14f, 0.0f, false, false, 71.41f, 96.0f)
                lineToRelative(0.6f, 0.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 8.08f, -7.72f)
                arcTo(76.0f, 76.0f, 0.0f, true, true, 156.0f, 168.0f)
                close()
            }
        }
        .build()
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
