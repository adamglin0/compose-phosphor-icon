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

public val BoldGroup.Cards: ImageVector
    get() {
        if (_cards != null) {
            return _cards!!
        }
        _cards = Builder(name = "Cards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 72.0f)
                lineTo(36.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 92.0f)
                lineTo(16.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(180.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(200.0f, 92.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 180.0f, 72.0f)
                close()
                moveTo(176.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 96.0f)
                lineTo(176.0f, 96.0f)
                close()
                moveTo(240.0f, 52.0f)
                lineTo(240.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(216.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(220.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 240.0f, 52.0f)
                close()
            }
        }
        .build()
        return _cards!!
    }

private var _cards: ImageVector? = null
