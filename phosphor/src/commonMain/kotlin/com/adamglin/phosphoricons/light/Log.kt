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

public val LightGroup.Log: ImageVector
    get() {
        if (_log != null) {
            return _log!!
        }
        _log = Builder(name = "Log", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.0f, 136.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 210.0f, 136.0f)
                close()
                moveTo(246.0f, 136.0f)
                curveToRelative(0.0f, 18.21f, -4.48f, 35.41f, -12.63f, 48.43f)
                curveTo(224.68f, 198.34f, 212.83f, 206.0f, 200.0f, 206.0f)
                lineTo(56.0f, 206.0f)
                curveToRelative(-12.83f, 0.0f, -24.68f, -7.66f, -33.37f, -21.57f)
                curveTo(14.48f, 171.41f, 10.0f, 154.21f, 10.0f, 136.0f)
                reflectiveCurveToRelative(4.48f, -35.41f, 12.63f, -48.43f)
                curveTo(31.32f, 73.66f, 43.17f, 66.0f, 56.0f, 66.0f)
                lineTo(93.52f, 66.0f)
                lineToRelative(38.24f, -38.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 136.0f, 26.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(138.49f, 38.0f)
                lineToRelative(-28.0f, 28.0f)
                lineTo(200.0f, 66.0f)
                curveToRelative(12.83f, 0.0f, 24.68f, 7.66f, 33.37f, 21.57f)
                curveTo(241.52f, 100.59f, 246.0f, 117.79f, 246.0f, 136.0f)
                close()
                moveTo(174.0f, 194.0f)
                arcToRelative(57.72f, 57.72f, 0.0f, false, true, -7.4f, -9.57f)
                arcTo(78.09f, 78.09f, 0.0f, false, true, 158.36f, 166.0f)
                lineTo(80.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(75.52f)
                arcTo(106.2f, 106.2f, 0.0f, false, true, 154.0f, 136.0f)
                curveToRelative(0.0f, -18.21f, 4.48f, -35.41f, 12.63f, -48.43f)
                arcTo(57.72f, 57.72f, 0.0f, false, true, 174.0f, 78.0f)
                lineTo(56.0f, 78.0f)
                curveToRelative(-13.89f, 0.0f, -26.16f, 15.1f, -31.36f, 36.0f)
                lineTo(104.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(22.54f, 126.0f)
                arcTo(93.69f, 93.69f, 0.0f, false, false, 22.0f, 136.0f)
                curveToRelative(0.0f, 31.44f, 15.57f, 58.0f, 34.0f, 58.0f)
                close()
                moveTo(234.0f, 136.0f)
                curveToRelative(0.0f, -31.44f, -15.57f, -58.0f, -34.0f, -58.0f)
                reflectiveCurveToRelative(-34.0f, 26.56f, -34.0f, 58.0f)
                reflectiveCurveToRelative(15.57f, 58.0f, 34.0f, 58.0f)
                reflectiveCurveTo(234.0f, 167.44f, 234.0f, 136.0f)
                close()
            }
        }
        .build()
        return _log!!
    }

private var _log: ImageVector? = null
