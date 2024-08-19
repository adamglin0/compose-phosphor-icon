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

public val BoldGroup.Googlephotoslogo: ImageVector
    get() {
        if (_googlephotoslogo != null) {
            return _googlephotoslogo!!
        }
        _googlephotoslogo = Builder(name = "Googlephotoslogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 116.0f)
                lineTo(198.64f, 116.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 128.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(116.0f, 57.36f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 12.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(57.36f, 140.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 128.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(140.0f, 198.64f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 244.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 116.0f)
                close()
                moveTo(180.0f, 88.0f)
                arcToRelative(51.38f, 51.38f, 0.0f, false, true, -8.18f, 28.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 37.4f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 180.0f, 88.0f)
                close()
                moveTo(88.0f, 76.0f)
                arcToRelative(51.38f, 51.38f, 0.0f, false, true, 28.0f, 8.18f)
                lineTo(116.0f, 116.0f)
                lineTo(37.4f, 116.0f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 88.0f, 76.0f)
                close()
                moveTo(76.0f, 168.0f)
                arcToRelative(51.38f, 51.38f, 0.0f, false, true, 8.18f, -28.0f)
                lineTo(116.0f, 140.0f)
                verticalLineToRelative(78.6f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 76.0f, 168.0f)
                close()
                moveTo(168.0f, 180.0f)
                arcToRelative(51.38f, 51.38f, 0.0f, false, true, -28.0f, -8.18f)
                lineTo(140.0f, 140.0f)
                horizontalLineToRelative(78.6f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 168.0f, 180.0f)
                close()
            }
        }
        .build()
        return _googlephotoslogo!!
    }

private var _googlephotoslogo: ImageVector? = null
