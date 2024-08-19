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

public val BoldGroup.`Face-mask-bold`: ImageVector
    get() {
        if (`_face-mask-bold` != null) {
            return `_face-mask-bold`!!
        }
        `_face-mask-bold` = Builder(name = "Face-mask-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 88.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(92.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                close()
                moveTo(164.0f, 128.0f)
                lineTo(92.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineToRelative(-6.15f)
                curveToRelative(-7.22f, 15.48f, -20.72f, 28.87f, -40.07f, 39.52f)
                arcToRelative(169.11f, 169.11f, 0.0f, false, true, -43.43f, 16.25f)
                arcToRelative(12.12f, 12.12f, 0.0f, false, true, -4.7f, 0.0f)
                arcToRelative(169.11f, 169.11f, 0.0f, false, true, -43.43f, -16.25f)
                curveToRelative(-19.35f, -10.65f, -32.85f, -24.0f, -40.07f, -39.52f)
                lineTo(36.0f, 164.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 0.0f, 128.0f)
                lineTo(0.0f, 104.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 36.0f, 68.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, true, 10.55f, -9.77f)
                lineToRelative(72.0f, -28.8f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, true, 14.86f, 0.0f)
                lineToRelative(72.0f, 28.8f)
                arcTo(19.93f, 19.93f, 0.0f, false, true, 218.0f, 68.0f)
                horizontalLineToRelative(2.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 256.0f, 104.0f)
                close()
                moveTo(36.13f, 140.0f)
                curveToRelative(-0.08f, -1.32f, -0.13f, -2.65f, -0.13f, -4.0f)
                lineTo(36.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(196.0f, 79.51f)
                lineToRelative(-68.0f, -27.2f)
                lineTo(60.0f, 79.51f)
                lineTo(60.0f, 136.0f)
                curveToRelative(0.0f, 40.63f, 55.72f, 56.65f, 68.0f, 59.69f)
                curveToRelative(12.25f, -3.0f, 68.0f, -19.05f, 68.0f, -59.69f)
                close()
                moveTo(232.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 1.35f, -0.05f, 2.68f, -0.13f, 4.0f)
                lineTo(220.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return `_face-mask-bold`!!
    }

private var `_face-mask-bold`: ImageVector? = null
