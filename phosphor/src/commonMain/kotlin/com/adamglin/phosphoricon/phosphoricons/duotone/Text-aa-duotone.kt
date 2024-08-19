package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Text-aa-duotone`: ImageVector
    get() {
        if (`_text-aa-duotone` != null) {
            return `_text-aa-duotone`!!
        }
        `_text-aa-duotone` = Builder(name = "Text-aa-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 164.0f)
                curveToRelative(0.0f, 15.46f, -14.33f, 28.0f, -32.0f, 28.0f)
                reflectiveCurveToRelative(-32.0f, -12.54f, -32.0f, -28.0f)
                reflectiveCurveToRelative(14.33f, -28.0f, 32.0f, -28.0f)
                reflectiveCurveTo(232.0f, 148.54f, 232.0f, 164.0f)
                close()
                moveTo(34.82f, 152.0f)
                horizontalLineToRelative(90.36f)
                lineTo(80.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.24f, 52.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.48f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.48f, 6.81f)
                lineTo(39.9f, 160.0f)
                horizontalLineToRelative(80.2f)
                lineToRelative(16.66f, 35.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.48f, -6.81f)
                close()
                moveTo(47.43f, 144.0f)
                lineTo(80.0f, 74.79f)
                lineTo(112.57f, 144.0f)
                close()
                moveTo(200.0f, 96.0f)
                curveToRelative(-12.76f, 0.0f, -22.73f, 3.47f, -29.63f, 10.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.26f, 11.36f)
                curveToRelative(3.8f, -3.77f, 10.0f, -5.68f, 18.37f, -5.68f)
                curveToRelative(13.23f, 0.0f, 24.0f, 9.0f, 24.0f, 20.0f)
                verticalLineToRelative(3.22f)
                arcTo(42.76f, 42.76f, 0.0f, false, false, 200.0f, 128.0f)
                curveToRelative(-22.06f, 0.0f, -40.0f, 16.15f, -40.0f, 36.0f)
                reflectiveCurveToRelative(17.94f, 36.0f, 40.0f, 36.0f)
                arcToRelative(42.73f, 42.73f, 0.0f, false, false, 24.0f, -7.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, -0.75f)
                lineTo(240.0f, 132.0f)
                curveTo(240.0f, 112.15f, 222.06f, 96.0f, 200.0f, 96.0f)
                close()
                moveTo(200.0f, 184.0f)
                curveToRelative(-13.23f, 0.0f, -24.0f, -9.0f, -24.0f, -20.0f)
                reflectiveCurveToRelative(10.77f, -20.0f, 24.0f, -20.0f)
                reflectiveCurveToRelative(24.0f, 9.0f, 24.0f, 20.0f)
                reflectiveCurveTo(213.23f, 184.0f, 200.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_text-aa-duotone`!!
    }

private var `_text-aa-duotone`: ImageVector? = null
