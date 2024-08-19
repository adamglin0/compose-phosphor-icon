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

public val BoldGroup.`Sock-bold`: ImageVector
    get() {
        if (`_sock-bold` != null) {
            return `_sock-bold`!!
        }
        `_sock-bold` = Builder(name = "Sock-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 12.0f)
                lineTo(104.0f, 12.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 32.0f)
                verticalLineToRelative(75.0f)
                lineTo(46.43f, 144.6f)
                arcToRelative(62.91f, 62.91f, 0.0f, true, false, 89.0f, 89.0f)
                lineToRelative(68.4f, -68.4f)
                arcToRelative(27.81f, 27.81f, 0.0f, false, false, 8.2f, -19.8f)
                lineTo(212.03f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 192.0f, 12.0f)
                close()
                moveTo(188.0f, 36.0f)
                lineTo(188.0f, 52.0f)
                lineTo(108.0f, 52.0f)
                lineTo(108.0f, 36.0f)
                close()
                moveTo(118.43f, 216.6f)
                arcToRelative(38.91f, 38.91f, 0.0f, true, true, -55.0f, -55.0f)
                lineToRelative(41.09f, -41.08f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 112.0f)
                lineTo(108.0f, 76.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(25.21f)
                arcTo(60.09f, 60.09f, 0.0f, false, false, 140.0f, 160.0f)
                arcToRelative(59.37f, 59.37f, 0.0f, false, false, 7.0f, 28.07f)
                close()
                moveTo(186.83f, 148.2f)
                lineTo(165.32f, 169.71f)
                arcTo(36.06f, 36.06f, 0.0f, false, true, 188.0f, 126.06f)
                verticalLineToRelative(19.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 186.83f, 148.2f)
                close()
            }
        }
        .build()
        return `_sock-bold`!!
    }

private var `_sock-bold`: ImageVector? = null
