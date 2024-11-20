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

public val LightGroup.FediverseLogo: ImageVector
    get() {
        if (_fediverseLogo != null) {
            return _fediverseLogo!!
        }
        _fediverseLogo = Builder(name = "FediverseLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 98.0f)
                arcToRelative(25.85f, 25.85f, 0.0f, false, false, -11.11f, 2.5f)
                lineTo(168.48f, 60.0f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 122.0f, 44.0f)
                arcToRelative(26.23f, 26.23f, 0.0f, false, false, 0.34f, 4.19f)
                lineTo(73.0f, 68.74f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 40.78f)
                lineTo(49.0f, 159.0f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 78.74f, 196.6f)
                lineTo(130.0f, 211.0f)
                curveToRelative(0.0f, 0.34f, 0.0f, 0.69f, 0.0f, 1.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 44.63f, -18.11f)
                lineToRelative(28.85f, -45.33f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 212.0f, 98.0f)
                close()
                moveTo(156.0f, 186.0f)
                curveToRelative(-0.78f, 0.0f, -1.55f, 0.0f, -2.31f, 0.11f)
                lineTo(136.2f, 133.62f)
                lineTo(187.0f, 131.2f)
                arcToRelative(26.08f, 26.08f, 0.0f, false, false, 6.35f, 10.91f)
                lineToRelative(-28.85f, 45.33f)
                arcTo(25.87f, 25.87f, 0.0f, false, false, 156.0f, 186.0f)
                close()
                moveTo(72.27f, 163.74f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 61.0f, 158.48f)
                lineTo(59.0f, 109.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 11.86f, -7.17f)
                lineToRelative(46.42f, 26.87f)
                close()
                moveTo(148.0f, 70.0f)
                arcToRelative(25.85f, 25.85f, 0.0f, false, false, 11.11f, -2.5f)
                lineTo(191.52f, 108.0f)
                arcToRelative(25.92f, 25.92f, 0.0f, false, false, -5.07f, 11.2f)
                lineToRelative(-50.76f, 2.42f)
                lineTo(148.0f, 70.0f)
                close()
                moveTo(148.0f, 30.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 148.0f, 30.0f)
                close()
                moveTo(127.0f, 59.26f)
                arcToRelative(26.19f, 26.19f, 0.0f, false, false, 9.34f, 7.95f)
                lineTo(124.0f, 118.77f)
                lineTo(76.9f, 91.48f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.76f, -11.67f)
                close()
                moveTo(38.0f, 84.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 52.0f, 98.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 38.0f, 84.0f)
                close()
                moveTo(56.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 198.0f)
                close()
                moveTo(82.0f, 185.0f)
                curveToRelative(0.0f, -0.34f, 0.0f, -0.69f, 0.0f, -1.0f)
                arcToRelative(25.94f, 25.94f, 0.0f, false, false, -2.35f, -10.79f)
                lineTo(125.0f, 137.94f)
                lineToRelative(17.32f, 52.0f)
                arcToRelative(26.23f, 26.23f, 0.0f, false, false, -9.05f, 9.49f)
                close()
                moveTo(156.0f, 226.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 156.0f, 226.0f)
                close()
                moveTo(212.0f, 138.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 138.0f)
                close()
            }
        }
        .build()
        return _fediverseLogo!!
    }

private var _fediverseLogo: ImageVector? = null
