package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Person-simple-run-fill`: ImageVector
    get() {
        if (`_person-simple-run-fill` != null) {
            return `_person-simple-run-fill`!!
        }
        `_person-simple-run-fill` = Builder(name = "Person-simple-run-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 56.0f)
                close()
                moveTo(223.28f, 130.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.6f, -4.0f)
                curveToRelative(-0.25f, 0.12f, -26.71f, 10.72f, -72.18f, -20.19f)
                curveToRelative(-52.29f, -35.54f, -88.0f, -7.77f, -89.51f, -6.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.0f, 12.48f)
                curveToRelative(0.26f, -0.21f, 25.12f, -19.5f, 64.07f, 3.27f)
                curveToRelative(-4.25f, 13.35f, -12.76f, 31.82f, -25.25f, 47.0f)
                curveToRelative(-18.56f, 22.48f, -41.11f, 32.56f, -67.0f, 30.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 31.2f, 208.0f)
                arcToRelative(92.29f, 92.29f, 0.0f, false, false, 9.34f, 0.47f)
                curveToRelative(27.38f, 0.0f, 52.0f, -12.38f, 71.63f, -36.18f)
                curveToRelative(0.57f, -0.69f, 1.14f, -1.4f, 1.69f, -2.1f)
                curveTo(133.31f, 175.29f, 168.0f, 190.3f, 168.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                curveToRelative(0.0f, -24.65f, -10.08f, -45.35f, -29.15f, -59.86f)
                arcToRelative(104.29f, 104.29f, 0.0f, false, false, -31.31f, -15.81f)
                arcTo(169.31f, 169.31f, 0.0f, false, false, 139.0f, 124.0f)
                curveToRelative(26.14f, 16.09f, 46.84f, 20.0f, 60.69f, 20.0f)
                curveToRelative(12.18f, 0.0f, 19.06f, -3.0f, 19.67f, -3.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 223.28f, 130.08f)
                close()
            }
        }
        .build()
        return `_person-simple-run-fill`!!
    }

private var `_person-simple-run-fill`: ImageVector? = null
