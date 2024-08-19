package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Lego-light`: ImageVector
    get() {
        if (`_lego-light` != null) {
            return `_lego-light`!!
        }
        `_lego-light` = Builder(name = "Lego-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.68f, 74.63f)
                lineTo(195.85f, 51.22f)
                curveTo(190.69f, 41.09f, 176.78f, 34.0f, 160.0f, 34.0f)
                curveToRelative(-21.31f, 0.0f, -38.0f, 11.42f, -38.0f, 26.0f)
                arcToRelative(19.06f, 19.06f, 0.0f, false, false, 1.56f, 7.51f)
                lineToRelative(-22.0f, 11.0f)
                arcTo(51.47f, 51.47f, 0.0f, false, false, 80.0f, 74.0f)
                curveToRelative(-21.31f, 0.0f, -38.0f, 11.42f, -38.0f, 26.0f)
                arcToRelative(19.06f, 19.06f, 0.0f, false, false, 1.56f, 7.51f)
                lineTo(13.32f, 122.63f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 128.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.32f, 5.37f)
                lineToRelative(64.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineToRelative(160.0f, -80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 246.0f, 144.0f)
                lineTo(246.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 242.68f, 74.63f)
                close()
                moveTo(80.0f, 153.29f)
                lineTo(29.42f, 128.0f)
                lineToRelative(21.77f, -10.88f)
                curveTo(58.1f, 122.59f, 68.36f, 126.0f, 80.0f, 126.0f)
                curveToRelative(21.31f, 0.0f, 38.0f, -11.42f, 38.0f, -26.0f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, -5.43f, -13.58f)
                lineToRelative(18.62f, -9.3f)
                curveTo(138.1f, 82.59f, 148.36f, 86.0f, 160.0f, 86.0f)
                curveToRelative(18.63f, 0.0f, 33.74f, -8.73f, 37.23f, -20.67f)
                lineTo(226.58f, 80.0f)
                close()
                moveTo(160.0f, 46.0f)
                curveToRelative(15.32f, 0.0f, 26.0f, 7.38f, 26.0f, 14.0f)
                reflectiveCurveToRelative(-10.68f, 14.0f, -26.0f, 14.0f)
                reflectiveCurveToRelative(-26.0f, -7.38f, -26.0f, -14.0f)
                reflectiveCurveTo(144.68f, 46.0f, 160.0f, 46.0f)
                close()
                moveTo(80.0f, 86.0f)
                curveToRelative(15.32f, 0.0f, 26.0f, 7.38f, 26.0f, 14.0f)
                reflectiveCurveToRelative(-10.68f, 14.0f, -26.0f, 14.0f)
                reflectiveCurveToRelative(-26.0f, -7.38f, -26.0f, -14.0f)
                reflectiveCurveTo(64.68f, 86.0f, 80.0f, 86.0f)
                close()
                moveTo(22.0f, 137.71f)
                lineToRelative(52.0f, 26.0f)
                verticalLineToRelative(50.58f)
                lineToRelative(-52.0f, -26.0f)
                close()
                moveTo(86.0f, 214.29f)
                lineTo(86.0f, 163.71f)
                lineToRelative(148.0f, -74.0f)
                verticalLineToRelative(50.58f)
                close()
            }
        }
        .build()
        return `_lego-light`!!
    }

private var `_lego-light`: ImageVector? = null
