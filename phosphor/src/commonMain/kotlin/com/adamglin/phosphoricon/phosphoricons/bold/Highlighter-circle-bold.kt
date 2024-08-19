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

public val BoldGroup.`Highlighter-circle-bold`: ImageVector
    get() {
        if (`_highlighter-circle-bold` != null) {
            return `_highlighter-circle-bold`!!
        }
        `_highlighter-circle-bold` = Builder(name = "Highlighter-circle-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.37f, 51.59f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.11f, 108.11f, 0.0f, false, false, 204.37f, 51.59f)
                close()
                moveTo(140.0f, 136.0f)
                lineTo(116.0f, 136.0f)
                lineTo(116.0f, 111.39f)
                lineToRelative(24.0f, -12.0f)
                close()
                moveTo(100.0f, 207.25f)
                lineTo(100.0f, 160.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(47.25f)
                arcToRelative(84.73f, 84.73f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(187.4f, 187.41f)
                arcToRelative(84.53f, 84.53f, 0.0f, false, true, -7.4f, 6.55f)
                lineTo(180.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -19.6f)
                lineTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.37f, -10.73f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 104.0f)
                verticalLineToRelative(32.41f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 156.0f)
                verticalLineToRelative(38.0f)
                arcToRelative(84.53f, 84.53f, 0.0f, false, true, -7.4f, -6.55f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 118.8f, 0.0f)
                close()
            }
        }
        .build()
        return `_highlighter-circle-bold`!!
    }

private var `_highlighter-circle-bold`: ImageVector? = null
