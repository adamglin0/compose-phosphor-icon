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

public val ThinGroup.NumberSquareNine: ImageVector
    get() {
        if (_numberSquareNine != null) {
            return _numberSquareNine!!
        }
        _numberSquareNine = Builder(name = "NumberSquareNine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(144.0f, 80.29f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -6.23f, 58.16f)
                lineTo(116.57f, 174.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.38f, 5.48f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 2.0f, 0.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.43f, -1.95f)
                lineTo(155.71f, 124.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 144.0f, 80.29f)
                close()
                moveTo(148.8f, 120.0f)
                lineToRelative(-0.06f, 0.09f)
                arcToRelative(22.62f, 22.62f, 0.0f, true, true, 0.06f, -0.09f)
                close()
            }
        }
        .build()
        return _numberSquareNine!!
    }

private var _numberSquareNine: ImageVector? = null
