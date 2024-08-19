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

public val BoldGroup.Hairdryer: ImageVector
    get() {
        if (_hairdryer != null) {
            return _hairdryer!!
        }
        _hairdryer = Builder(name = "Hairdryer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 88.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 88.0f)
                close()
                moveTo(168.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 96.0f)
                close()
                moveTo(181.06f, 208.28f)
                lineTo(212.31f, 139.52f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 168.0f, 20.0f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, false, -2.0f, 0.16f)
                lineTo(28.71f, 43.05f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 12.0f, 62.78f)
                verticalLineToRelative(50.44f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 28.71f, 133.0f)
                lineTo(124.0f, 148.83f)
                lineTo(124.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.69f, 19.7f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 184.0f, 256.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(184.0f, 232.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -18.41f, -12.19f)
                arcTo(20.09f, 20.09f, 0.0f, false, false, 181.06f, 208.28f)
                close()
                moveTo(36.0f, 66.17f)
                lineTo(168.93f, 44.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f)
                lineTo(36.0f, 109.83f)
                close()
                moveTo(166.0f, 155.84f)
                arcToRelative(11.81f, 11.81f, 0.0f, false, false, 2.0f, 0.16f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, false, 10.85f, -0.88f)
                lineTo(160.27f, 196.0f)
                lineTo(148.0f, 196.0f)
                lineTo(148.0f, 152.83f)
                close()
            }
        }
        .build()
        return _hairdryer!!
    }

private var _hairdryer: ImageVector? = null
