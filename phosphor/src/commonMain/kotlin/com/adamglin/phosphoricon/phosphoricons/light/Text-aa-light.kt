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

public val LightGroup.`Text-aa-light`: ImageVector
    get() {
        if (`_text-aa-light` != null) {
            return `_text-aa-light`!!
        }
        `_text-aa-light` = Builder(name = "Text-aa-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.43f, 53.45f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.86f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.86f, 5.11f)
                lineTo(38.63f, 158.0f)
                horizontalLineToRelative(82.74f)
                lineToRelative(17.2f, 36.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.86f, -5.11f)
                close()
                moveTo(44.28f, 146.0f)
                lineTo(80.0f, 70.09f)
                lineTo(115.72f, 146.0f)
                close()
                moveTo(200.0f, 98.0f)
                curveToRelative(-12.21f, 0.0f, -21.71f, 3.28f, -28.23f, 9.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.46f, 8.52f)
                curveToRelative(4.18f, -4.15f, 10.84f, -6.26f, 19.77f, -6.26f)
                curveToRelative(14.34f, 0.0f, 26.0f, 9.87f, 26.0f, 22.0f)
                verticalLineToRelative(7.24f)
                arcTo(40.36f, 40.36f, 0.0f, false, false, 200.0f, 130.0f)
                curveToRelative(-20.95f, 0.0f, -38.0f, 15.25f, -38.0f, 34.0f)
                reflectiveCurveToRelative(17.05f, 34.0f, 38.0f, 34.0f)
                arcToRelative(40.36f, 40.36f, 0.0f, false, false, 26.0f, -9.24f)
                lineTo(226.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(238.0f, 132.0f)
                curveTo(238.0f, 113.25f, 221.0f, 98.0f, 200.0f, 98.0f)
                close()
                moveTo(200.0f, 186.0f)
                curveToRelative(-14.34f, 0.0f, -26.0f, -9.87f, -26.0f, -22.0f)
                reflectiveCurveToRelative(11.66f, -22.0f, 26.0f, -22.0f)
                reflectiveCurveToRelative(26.0f, 9.87f, 26.0f, 22.0f)
                reflectiveCurveTo(214.34f, 186.0f, 200.0f, 186.0f)
                close()
            }
        }
        .build()
        return `_text-aa-light`!!
    }

private var `_text-aa-light`: ImageVector? = null
