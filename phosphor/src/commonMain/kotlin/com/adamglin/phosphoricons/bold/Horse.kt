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

public val BoldGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 104.0f)
                close()
                moveTo(236.0f, 129.53f)
                arcTo(108.3f, 108.3f, 0.0f, false, true, 130.18f, 236.0f)
                lineToRelative(-2.25f, 0.0f)
                arcTo(107.31f, 107.31f, 0.0f, false, true, 56.0f, 208.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.0f, -17.88f)
                arcToRelative(81.42f, 81.42f, 0.0f, false, false, 16.2f, 11.26f)
                lineToRelative(21.54f, -29.62f)
                curveToRelative(-20.4f, -7.0f, -41.91f, -3.33f, -54.43f, -1.21f)
                arcToRelative(35.79f, 35.79f, 0.0f, false, true, -35.25f, -14.43f)
                curveToRelative(-0.16f, -0.21f, -0.31f, -0.43f, -0.45f, -0.65f)
                lineToRelative(-13.78f, -22.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 9.43f, 118.0f)
                lineTo(108.0f, 53.51f)
                lineTo(108.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(8.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 236.0f, 129.53f)
                close()
                moveTo(212.0f, 129.2f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -80.0f, -85.11f)
                lineTo(132.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.43f, 10.0f)
                lineTo(32.41f, 131.61f)
                lineToRelative(7.31f, 11.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.58f, 4.54f)
                curveToRelative(16.23f, -2.75f, 49.4f, -8.36f, 79.64f, 8.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 164.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                arcToRelative(60.09f, 60.09f, 0.0f, false, true, -53.64f, 59.66f)
                lineToRelative(-22.45f, 30.87f)
                arcToRelative(87.57f, 87.57f, 0.0f, false, false, 17.8f, 1.45f)
                arcTo(84.29f, 84.29f, 0.0f, false, false, 212.0f, 129.2f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
