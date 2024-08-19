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

public val BoldGroup.`Coffee-bold`: ImageVector
    get() {
        if (`_coffee-bold` != null) {
            return `_coffee-bold`!!
        }
        `_coffee-bold` = Builder(name = "Coffee-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(100.24f, 100.24f, 0.0f, false, false, 26.73f, 68.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(193.27f, 204.0f)
                arcToRelative(100.75f, 100.75f, 0.0f, false, false, 20.0f, -32.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 256.0f, 128.0f)
                verticalLineToRelative(-8.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 212.0f, 76.0f)
                close()
                moveTo(196.0f, 136.0f)
                arcToRelative(76.27f, 76.27f, 0.0f, false, true, -42.0f, 68.0f)
                lineTo(86.0f, 204.0f)
                arcToRelative(76.27f, 76.27f, 0.0f, false, true, -42.0f, -68.0f)
                lineTo(44.0f, 100.0f)
                lineTo(196.0f, 100.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -12.57f, 18.55f)
                arcTo(97.17f, 97.17f, 0.0f, false, false, 220.0f, 136.0f)
                lineTo(220.0f, 101.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 232.0f, 120.0f)
                close()
                moveTo(68.0f, 48.0f)
                lineTo(68.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(92.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(108.0f, 48.0f)
                lineTo(108.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(132.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(148.0f, 48.0f)
                lineTo(148.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(172.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_coffee-bold`!!
    }

private var `_coffee-bold`: ImageVector? = null
