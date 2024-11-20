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

public val BoldGroup.ThreeD: ImageVector
    get() {
        if (_threeD != null) {
            return _threeD!!
        }
        _threeD = Builder(name = "ThreeD", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.83f, -18.88f)
                lineTo(77.0f, 92.0f)
                lineTo(52.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.83f, 18.88f)
                lineToRelative(-18.34f, 26.2f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 43.43f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 60.57f, 159.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 148.0f)
                close()
                moveTo(164.0f, 68.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 0.0f, 120.0f)
                lineTo(140.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(128.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                close()
                moveTo(164.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
                moveTo(32.0f, 56.0f)
                lineTo(224.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(224.0f, 200.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(224.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _threeD!!
    }

private var _threeD: ImageVector? = null
