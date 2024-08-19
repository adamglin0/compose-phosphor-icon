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

public val LightGroup.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = Builder(name = "Strategy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 154.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 34.0f, 34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 76.0f, 154.0f)
                close()
                moveTo(76.0f, 210.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 76.0f, 210.0f)
                close()
                moveTo(43.76f, 107.76f)
                lineTo(59.52f, 92.0f)
                lineTo(43.76f, 76.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(68.0f, 83.52f)
                lineTo(83.76f, 67.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(76.48f, 92.0f)
                lineToRelative(15.76f, 15.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(68.0f, 100.48f)
                lineTo(52.24f, 116.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                close()
                moveTo(228.24f, 203.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(204.0f, 196.48f)
                lineToRelative(-15.76f, 15.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(195.52f, 188.0f)
                lineToRelative(-15.76f, -15.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(204.0f, 179.52f)
                lineToRelative(15.76f, -15.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineTo(212.48f, 188.0f)
                close()
                moveTo(182.55f, 112.3f)
                curveToRelative(-6.0f, 21.66f, -24.55f, 40.38f, -45.09f, 45.52f)
                arcTo(6.14f, 6.14f, 0.0f, false, true, 136.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.46f, -11.82f)
                curveToRelative(16.29f, -4.07f, 31.62f, -19.67f, 36.44f, -37.09f)
                curveToRelative(3.33f, -12.0f, 3.39f, -30.24f, -15.22f, -48.85f)
                lineTo(150.0f, 54.48f)
                lineTo(150.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(158.48f, 46.0f)
                lineToRelative(5.76f, 5.76f)
                curveTo(182.0f, 69.47f, 188.45f, 91.0f, 182.55f, 112.3f)
                close()
            }
        }
        .build()
        return _strategy!!
    }

private var _strategy: ImageVector? = null
