package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Cowboyhat: ImageVector
    get() {
        if (_cowboyhat != null) {
            return _cowboyhat!!
        }
        _cowboyhat = Builder(name = "Cowboyhat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.18f, 5.64f)
                quadToRelative(-2.48f, 4.0f, -5.0f, 7.57f)
                lineTo(182.25f, 52.33f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 150.1f, 40.4f)
                lineToRelative(-0.18f, 0.15f)
                lineTo(128.0f, 58.8f)
                lineTo(106.08f, 40.55f)
                lineToRelative(-0.18f, -0.15f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 73.75f, 52.3f)
                lineTo(59.14f, 129.22f)
                quadToRelative(-2.49f, -3.61f, -5.0f, -7.57f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 116.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, 88.0f)
                lineTo(212.0f, 204.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 0.0f, -88.0f)
                close()
                moveTo(96.07f, 63.44f)
                lineToRelative(19.25f, 16.0f)
                lineToRelative(0.19f, 0.15f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 25.0f, 0.0f)
                lineToRelative(0.19f, -0.15f)
                lineToRelative(19.25f, -16.0f)
                lineTo(171.44f, 124.0f)
                lineTo(84.56f, 124.0f)
                close()
                moveTo(44.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -5.94f, -39.1f)
                curveToRelative(11.7f, 17.38f, 23.7f, 30.0f, 35.0f, 39.1f)
                close()
                moveTo(79.0f, 153.25f)
                lineTo(80.0f, 148.0f)
                horizontalLineToRelative(96.0f)
                lineToRelative(1.0f, 5.25f)
                curveToRelative(-25.33f, 25.0f, -46.71f, 26.65f, -49.0f, 26.75f)
                curveTo(125.71f, 179.9f, 104.33f, 178.29f, 79.0f, 153.25f)
                close()
                moveTo(212.0f, 180.0f)
                lineTo(183.0f, 180.0f)
                curveToRelative(11.28f, -9.12f, 23.28f, -21.72f, 35.0f, -39.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 180.0f)
                close()
            }
        }
        .build()
        return _cowboyhat!!
    }

private var _cowboyhat: ImageVector? = null
