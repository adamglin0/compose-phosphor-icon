package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Shirtfolded: ImageVector
    get() {
        if (_shirtfolded != null) {
            return _shirtfolded!!
        }
        _shirtfolded = Builder(name = "Shirtfolded", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                lineTo(179.31f, 40.0f)
                lineTo(165.66f, 26.34f)
                horizontalLineToRelative(0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 24.0f)
                lineTo(96.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                horizontalLineToRelative(0.0f)
                lineTo(76.69f, 40.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 56.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(128.0f, 65.58f)
                lineTo(111.0f, 40.0f)
                horizontalLineToRelative(34.1f)
                close()
                moveTo(161.24f, 44.58f)
                lineTo(168.0f, 51.31f)
                lineTo(168.0f, 104.0f)
                lineTo(138.57f, 78.56f)
                close()
                moveTo(88.0f, 51.31f)
                lineToRelative(6.76f, -6.75f)
                lineToRelative(22.67f, 34.0f)
                lineTo(88.0f, 104.0f)
                close()
                moveTo(56.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 9.21f, 14.49f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 88.0f, 120.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, 10.2f, -3.73f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.11f, -0.1f)
                lineTo(120.0f, 97.48f)
                lineTo(120.0f, 208.0f)
                lineTo(56.0f, 208.0f)
                close()
                moveTo(200.0f, 208.0f)
                lineTo(136.0f, 208.0f)
                lineTo(136.0f, 97.48f)
                lineToRelative(21.65f, 18.7f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.11f, 0.1f)
                arcTo(15.89f, 15.89f, 0.0f, false, false, 168.0f, 120.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 6.83f, -1.54f)
                arcTo(15.85f, 15.85f, 0.0f, false, false, 184.0f, 104.0f)
                lineTo(184.0f, 56.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _shirtfolded!!
    }

private var _shirtfolded: ImageVector? = null
