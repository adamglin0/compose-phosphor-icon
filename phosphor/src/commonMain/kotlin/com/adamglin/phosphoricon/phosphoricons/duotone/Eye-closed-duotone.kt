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

public val DuotoneGroup.`Eye-closed-duotone`: ImageVector
    get() {
        if (`_eye-closed-duotone` != null) {
            return `_eye-closed-duotone`!!
        }
        `_eye-closed-duotone` = Builder(name = "Eye-closed-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 104.0f)
                curveToRelative(-16.81f, 20.81f, -47.63f, 48.0f, -96.0f, 48.0f)
                reflectiveCurveToRelative(-79.19f, -27.19f, -96.0f, -48.0f)
                curveToRelative(16.81f, -20.81f, 47.63f, -48.0f, 96.0f, -48.0f)
                reflectiveCurveTo(207.19f, 83.19f, 224.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 175.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.92f, -3.0f)
                lineToRelative(-19.0f, -33.2f)
                arcTo(123.23f, 123.23f, 0.0f, false, true, 162.0f, 155.46f)
                lineToRelative(5.87f, 35.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, 9.21f)
                arcTo(8.4f, 8.4f, 0.0f, false, true, 160.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.69f)
                lineToRelative(-5.77f, -34.58f)
                arcToRelative(133.06f, 133.06f, 0.0f, false, true, -36.68f, 0.0f)
                lineToRelative(-5.77f, 34.58f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 200.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, -1.32f, -0.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -9.21f)
                lineTo(94.0f, 155.46f)
                arcToRelative(123.23f, 123.23f, 0.0f, false, true, -36.06f, -16.69f)
                lineTo(39.0f, 172.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 25.06f, 164.0f)
                lineToRelative(20.0f, -35.0f)
                arcToRelative(153.47f, 153.47f, 0.0f, false, true, -19.3f, -20.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 38.22f, 99.0f)
                curveToRelative(16.6f, 20.54f, 45.64f, 45.0f, 89.78f, 45.0f)
                reflectiveCurveToRelative(73.18f, -24.49f, 89.78f, -45.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 230.22f, 109.0f)
                arcToRelative(153.47f, 153.47f, 0.0f, false, true, -19.3f, 20.0f)
                lineToRelative(20.0f, 35.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 228.0f, 175.0f)
                close()
            }
        }
        .build()
        return `_eye-closed-duotone`!!
    }

private var `_eye-closed-duotone`: ImageVector? = null
