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

public val BoldGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 44.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -8.0f, 1.0f)
                lineTo(180.0f, 44.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -60.79f, -14.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 76.0f, 60.0f)
                verticalLineToRelative(50.83f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -52.0f, 36.7f)
                curveTo(55.82f, 214.6f, 75.35f, 244.0f, 128.0f, 244.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                lineTo(220.0f, 76.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 188.0f, 44.0f)
                close()
                moveTo(196.0f, 152.0f)
                arcToRelative(68.08f, 68.08f, 0.0f, false, true, -68.0f, 68.0f)
                curveToRelative(-35.83f, 0.0f, -49.71f, -14.0f, -82.48f, -83.14f)
                curveToRelative(-0.14f, -0.29f, -0.29f, -0.58f, -0.45f, -0.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.85f, -8.0f)
                lineToRelative(0.21f, 0.35f)
                lineToRelative(18.68f, 30.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 152.0f)
                lineTo(100.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(180.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
