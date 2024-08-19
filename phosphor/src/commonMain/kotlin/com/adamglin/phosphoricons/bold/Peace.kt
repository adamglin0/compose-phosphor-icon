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

public val BoldGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(83.43f, 83.43f, 0.0f, false, true, -9.0f, 37.84f)
                lineToRelative(-63.0f, -44.09f)
                lineTo(140.0f, 44.87f)
                arcTo(84.12f, 84.12f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(116.0f, 44.87f)
                verticalLineToRelative(76.88f)
                lineTo(53.0f, 165.84f)
                arcToRelative(83.93f, 83.93f, 0.0f, false, true, 63.0f, -121.0f)
                close()
                moveTo(66.83f, 185.48f)
                lineTo(116.0f, 151.05f)
                verticalLineToRelative(60.08f)
                arcTo(83.86f, 83.86f, 0.0f, false, true, 66.83f, 185.48f)
                close()
                moveTo(140.0f, 211.13f)
                lineTo(140.0f, 151.05f)
                lineToRelative(49.17f, 34.43f)
                arcTo(83.86f, 83.86f, 0.0f, false, true, 140.0f, 211.13f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
