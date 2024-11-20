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

public val ThinGroup.Hoodie: ImageVector
    get() {
        if (_hoodie != null) {
            return _hoodie!!
        }
        _hoodie = Builder(name = "Hoodie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 122.75f)
                lineTo(179.71f, 41.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.34f)
                lineTo(86.27f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.34f)
                lineTo(22.0f, 122.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.6f, 9.82f)
                lineToRelative(21.44f, 78.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 53.43f, 220.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(92.0f, 188.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(26.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.57f, -8.84f)
                lineToRelative(21.44f, -78.59f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 234.0f, 122.75f)
                close()
                moveTo(80.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(76.0f, 62.0f)
                lineToRelative(32.0f, 18.86f)
                lineTo(108.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(116.0f, 85.57f)
                lineToRelative(10.0f, 5.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.06f, 0.0f)
                lineToRelative(10.0f, -5.88f)
                lineTo(140.06f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.06f, 80.85f)
                lineTo(180.0f, 62.0f)
                lineTo(180.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                close()
                moveTo(82.94f, 45.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 86.27f, 44.0f)
                horizontalLineToRelative(83.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.33f, 1.78f)
                lineToRelative(5.27f, 7.91f)
                lineTo(128.0f, 83.36f)
                lineTo(77.67f, 53.69f)
                close()
                moveTo(84.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(53.43f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.85f, -2.95f)
                lineTo(28.14f, 130.46f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.53f, -3.27f)
                lineTo(68.0f, 68.2f)
                lineTo(68.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(227.86f, 130.46f)
                lineTo(206.42f, 209.05f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.85f, 2.95f)
                lineTo(176.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(172.0f, 188.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 68.2f)
                lineToRelative(39.33f, 59.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 227.86f, 130.46f)
                close()
            }
        }
        .build()
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
