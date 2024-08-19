package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Textb: ImageVector
    get() {
        if (_textb != null) {
            return _textb!!
        }
        _textb = Builder(name = "Textb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(96.0f, 176.0f)
                lineTo(96.0f, 136.0f)
                horizontalLineToRelative(52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 156.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(184.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -18.0f, -31.15f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 140.0f, 64.0f)
                lineTo(88.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(80.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(60.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 184.0f, 156.0f)
                close()
                moveTo(160.0f, 100.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(96.0f, 80.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 160.0f, 100.0f)
                close()
            }
        }
        .build()
        return _textb!!
    }

private var _textb: ImageVector? = null