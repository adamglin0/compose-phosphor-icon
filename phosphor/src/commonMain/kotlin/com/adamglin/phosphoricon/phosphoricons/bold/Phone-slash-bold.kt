package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Phone-slash-bold`: ImageVector
    get() {
        if (`_phone-slash-bold` != null) {
            return `_phone-slash-bold`!!
        }
        `_phone-slash-bold` = Builder(name = "Phone-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.9f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.15f, 48.07f)
                lineTo(63.0f, 74.36f)
                arcToRelative(147.07f, 147.07f, 0.0f, false, false, -41.43f, 29.0f)
                curveToRelative(-21.45f, 21.46f, -23.52f, 53.1f, -5.0f, 77.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 32.38f, 188.0f)
                arcToRelative(19.81f, 19.81f, 0.0f, false, false, 7.12f, -1.32f)
                lineToRelative(48.9f, -17.35f)
                lineToRelative(0.45f, -0.17f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 101.0f, 154.5f)
                lineToRelative(5.44f, -27.22f)
                curveToRelative(1.22f, -0.38f, 2.47f, -0.72f, 3.72f, -1.0f)
                lineToRelative(88.91f, 97.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.75f, -16.14f)
                close()
                moveTo(83.4f, 120.29f)
                lineTo(78.0f, 147.57f)
                lineTo(33.84f, 163.22f)
                curveToRelative(-9.16f, -13.84f, -7.41f, -30.76f, 4.73f, -42.9f)
                arcTo(121.58f, 121.58f, 0.0f, false, true, 80.07f, 93.1f)
                lineTo(92.74f, 107.0f)
                arcTo(20.06f, 20.06f, 0.0f, false, false, 83.4f, 120.29f)
                close()
                moveTo(239.4f, 180.29f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, true, -11.24f, 7.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.95f, -22.92f)
                curveToRelative(10.21f, -14.07f, 8.75f, -31.71f, -3.79f, -44.25f)
                curveTo(194.77f, 97.65f, 164.0f, 84.76f, 130.91f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.27f, -24.0f)
                horizontalLineToRelative(0.27f)
                curveToRelative(39.33f, 0.87f, 75.89f, 16.25f, 102.94f, 43.31f)
                curveTo(255.84f, 124.81f, 257.91f, 156.45f, 239.41f, 180.3f)
                close()
            }
        }
        .build()
        return `_phone-slash-bold`!!
    }

private var `_phone-slash-bold`: ImageVector? = null
