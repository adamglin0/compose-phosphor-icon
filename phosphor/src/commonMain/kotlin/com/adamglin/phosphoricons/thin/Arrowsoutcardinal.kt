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

public val ThinGroup.Arrowsoutcardinal: ImageVector
    get() {
        if (_arrowsoutcardinal != null) {
            return _arrowsoutcardinal!!
        }
        _arrowsoutcardinal = Builder(name = "Arrowsoutcardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.17f, 58.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                lineTo(132.0f, 33.66f)
                lineTo(132.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 33.66f)
                lineTo(98.83f, 58.83f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 93.17f, 58.83f)
                close()
                moveTo(157.17f, 197.17f)
                lineTo(132.0f, 222.34f)
                lineTo(132.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(62.34f)
                lineTo(98.83f, 197.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                close()
                moveTo(234.83f, 125.17f)
                lineTo(202.83f, 93.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(222.34f, 124.0f)
                lineTo(160.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(62.34f)
                lineToRelative(-25.17f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 125.17f)
                close()
                moveTo(33.66f, 132.0f)
                lineTo(96.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(33.66f, 124.0f)
                lineTo(58.83f, 98.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _arrowsoutcardinal!!
    }

private var _arrowsoutcardinal: ImageVector? = null
