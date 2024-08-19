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

public val BoldGroup.`Cards-three-bold`: ImageVector
    get() {
        if (`_cards-three-bold` != null) {
            return `_cards-three-bold`!!
        }
        `_cards-three-bold` = Builder(name = "Cards-three-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                lineTo(48.0f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 116.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
                moveTo(204.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 120.0f)
                lineTo(204.0f, 120.0f)
                close()
                moveTo(44.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 56.0f)
                lineTo(200.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(56.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 44.0f, 68.0f)
                close()
                moveTo(60.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 16.0f)
                lineTo(184.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 28.0f)
                close()
            }
        }
        .build()
        return `_cards-three-bold`!!
    }

private var `_cards-three-bold`: ImageVector? = null
