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

public val BoldGroup.Handtap: ImageVector
    get() {
        if (_handtap != null) {
            return _handtap!!
        }
        _handtap = Builder(name = "Handtap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 156.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 13.85f, -1.63f, 26.52f, -4.58f, 35.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.84f, -7.36f)
                curveToRelative(2.14f, -6.65f, 3.42f, -17.24f, 3.42f, -28.32f)
                verticalLineTo(156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.18f, 6.34f)
                lineToRelative(-18.68f, -30.0f)
                lineToRelative(-0.21f, -0.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 53.0f, 175.92f)
                lineTo(78.27f, 217.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.56f, 12.39f)
                lineToRelative(-25.31f, -42.0f)
                lineToRelative(-0.12f, -0.2f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 84.0f, 150.83f)
                verticalLineTo(84.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                verticalLineToRelative(25.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 36.78f, 17.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 228.0f, 156.0f)
                close()
                moveTo(56.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 84.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 44.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 96.0f)
                close()
            }
        }
        .build()
        return _handtap!!
    }

private var _handtap: ImageVector? = null
