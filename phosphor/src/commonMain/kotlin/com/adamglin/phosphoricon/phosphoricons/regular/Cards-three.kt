package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Cards-three`: ImageVector
    get() {
        if (`_cards-three` != null) {
            return `_cards-three`!!
        }
        `_cards-three` = Builder(name = "Cards-three", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                lineTo(48.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 88.0f)
                close()
                moveTo(208.0f, 200.0f)
                lineTo(48.0f, 200.0f)
                lineTo(48.0f, 104.0f)
                lineTo(208.0f, 104.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(48.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(200.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(56.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 64.0f)
                close()
                moveTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(184.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(72.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 32.0f)
                close()
            }
        }
        .build()
        return `_cards-three`!!
    }

private var `_cards-three`: ImageVector? = null
