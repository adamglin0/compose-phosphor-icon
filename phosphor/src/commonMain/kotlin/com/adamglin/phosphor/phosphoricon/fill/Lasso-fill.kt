package com.adamglin.phosphor.phosphoricon.fill

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
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Lasso-fill`: ImageVector
    get() {
        if (`_lasso-fill` != null) {
            return `_lasso-fill`!!
        }
        `_lasso-fill` = Builder(name = "Lasso-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.43f, 136.11f)
                arcToRelative(17.14f, 17.14f, 0.0f, false, false, -15.35f, 6.1f)
                curveToRelative(9.31f, 6.56f, 22.51f, 11.33f, 37.43f, 13.07f)
                curveTo(110.41f, 143.33f, 101.72f, 137.0f, 93.43f, 136.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(127.65f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.23f, -6.34f)
                curveToRelative(7.5f, -10.23f, 11.58f, -23.24f, 11.58f, -37.84f)
                curveToRelative(0.0f, -2.79f, -0.13f, -5.46f, -0.35f, -8.05f)
                curveTo(176.79f, 169.33f, 208.0f, 147.47f, 208.0f, 120.0f)
                curveToRelative(0.0f, -29.15f, -35.14f, -52.0f, -80.0f, -52.0f)
                reflectiveCurveTo(48.0f, 90.84f, 48.0f, 120.0f)
                curveToRelative(0.0f, 27.31f, 30.82f, 49.07f, 71.58f, 51.73f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, true, 0.42f, 8.09f)
                curveToRelative(0.0f, 17.62f, -7.65f, 31.95f, -21.0f, 39.32f)
                arcTo(38.77f, 38.77f, 0.0f, false, true, 79.27f, 224.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(192.0f, 120.0f)
                curveToRelative(0.0f, -19.51f, -29.31f, -36.0f, -64.0f, -36.0f)
                reflectiveCurveToRelative(-64.0f, 16.48f, -64.0f, 36.0f)
                arcToRelative(21.29f, 21.29f, 0.0f, false, false, 3.0f, 10.63f)
                arcTo(33.65f, 33.65f, 0.0f, false, true, 95.16f, 120.2f)
                curveToRelative(15.0f, 1.63f, 30.84f, 13.4f, 37.54f, 35.68f)
                curveTo(165.3f, 154.47f, 192.0f, 138.62f, 192.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_lasso-fill`!!
    }

private var `_lasso-fill`: ImageVector? = null
