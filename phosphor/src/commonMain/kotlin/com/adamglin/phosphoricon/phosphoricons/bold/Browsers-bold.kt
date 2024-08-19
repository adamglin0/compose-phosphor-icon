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

public val BoldGroup.`Browsers-bold`: ImageVector
    get() {
        if (`_browsers-bold` != null) {
            return `_browsers-bold`!!
        }
        `_browsers-bold` = Builder(name = "Browsers-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 32.0f)
                lineTo(76.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 52.0f)
                lineTo(56.0f, 72.0f)
                lineTo(36.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 92.0f)
                lineTo(16.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(180.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(240.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 220.0f, 32.0f)
                close()
                moveTo(176.0f, 96.0f)
                verticalLineToRelative(16.0f)
                lineTo(40.0f, 112.0f)
                lineTo(40.0f, 96.0f)
                close()
                moveTo(176.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 136.0f)
                lineTo(176.0f, 136.0f)
                close()
                moveTo(216.0f, 160.0f)
                lineTo(200.0f, 160.0f)
                lineTo(200.0f, 92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(80.0f, 72.0f)
                lineTo(80.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_browsers-bold`!!
    }

private var `_browsers-bold`: ImageVector? = null
