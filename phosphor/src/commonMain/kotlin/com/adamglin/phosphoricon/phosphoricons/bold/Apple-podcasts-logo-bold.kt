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

public val BoldGroup.`Apple-podcasts-logo-bold`: ImageVector
    get() {
        if (`_apple-podcasts-logo-bold` != null) {
            return `_apple-podcasts-logo-bold`!!
        }
        `_apple-podcasts-logo-bold` = Builder(name = "Apple-podcasts-logo-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.36f, 130.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -66.72f, 0.0f)
                arcToRelative(28.35f, 28.35f, 0.0f, false, false, -4.52f, 4.51f)
                arcToRelative(27.86f, 27.86f, 0.0f, false, false, -5.42f, 23.67f)
                lineToRelative(12.75f, 56.0f)
                arcTo(27.87f, 27.87f, 0.0f, false, false, 124.77f, 236.0f)
                horizontalLineToRelative(6.46f)
                arcToRelative(27.87f, 27.87f, 0.0f, false, false, 27.32f, -21.79f)
                lineToRelative(12.75f, -56.0f)
                arcToRelative(27.86f, 27.86f, 0.0f, false, false, -5.42f, -23.67f)
                arcTo(28.35f, 28.35f, 0.0f, false, false, 161.36f, 130.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 92.0f)
                close()
                moveTo(147.89f, 152.88f)
                lineTo(135.15f, 208.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.92f, 3.12f)
                horizontalLineToRelative(-6.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.92f, -3.12f)
                lineToRelative(-12.74f, -56.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.77f, -3.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 148.0f)
                lineTo(144.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.15f, 1.51f)
                arcTo(3.92f, 3.92f, 0.0f, false, true, 147.89f, 152.88f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(107.88f, 107.88f, 0.0f, false, true, -38.0f, 82.21f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 182.47f, 192.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -108.94f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 58.0f, 210.21f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_apple-podcasts-logo-bold`!!
    }

private var `_apple-podcasts-logo-bold`: ImageVector? = null
