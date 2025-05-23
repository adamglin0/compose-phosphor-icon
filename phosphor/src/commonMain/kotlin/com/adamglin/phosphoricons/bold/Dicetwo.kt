package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) {
            return _diceTwo!!
        }
        _diceTwo = Builder(name = "DiceTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 28.0f)
                lineTo(64.0f, 28.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(228.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 192.0f, 28.0f)
                close()
                moveTo(204.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(64.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(52.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 64.0f, 52.0f)
                lineTo(192.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(120.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 104.0f)
                close()
                moveTo(168.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 152.0f)
                close()
            }
        }
        .build()
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
