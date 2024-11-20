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

public val ThinGroup.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 56.0f)
                lineTo(84.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(92.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(120.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(124.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(116.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 60.0f)
                close()
                moveTo(152.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(148.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 152.0f, 60.0f)
                close()
                moveTo(244.0f, 120.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineToRelative(-0.41f)
                arcToRelative(92.53f, 92.53f, 0.0f, false, true, -35.76f, 48.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(32.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(68.17f, 212.0f)
                arcTo(92.34f, 92.34f, 0.0f, false, true, 28.0f, 136.0f)
                lineTo(28.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 84.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 244.0f, 120.0f)
                close()
                moveTo(204.0f, 136.0f)
                lineTo(204.0f, 92.0f)
                lineTo(36.0f, 92.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(84.28f, 84.28f, 0.0f, false, false, 48.21f, 76.0f)
                horizontalLineToRelative(71.58f)
                arcTo(84.28f, 84.28f, 0.0f, false, false, 204.0f, 136.0f)
                close()
                moveTo(236.0f, 120.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -24.0f, -27.71f)
                lineTo(212.0f, 136.0f)
                arcToRelative(91.75f, 91.75f, 0.0f, false, true, -2.2f, 19.94f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
