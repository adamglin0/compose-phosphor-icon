package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.TextB: ImageVector
    get() {
        if (_textB != null) {
            return _textB!!
        }
        _textB = Builder(name = "TextB", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.27f, 117.21f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 148.0f, 44.0f)
                lineTo(80.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(76.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 10.27f, -86.79f)
                close()
                moveTo(84.0f, 52.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                lineTo(84.0f, 116.0f)
                close()
                moveTo(160.0f, 196.0f)
                lineTo(84.0f, 196.0f)
                lineTo(84.0f, 124.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
            }
        }
        .build()
        return _textB!!
    }

private var _textB: ImageVector? = null
