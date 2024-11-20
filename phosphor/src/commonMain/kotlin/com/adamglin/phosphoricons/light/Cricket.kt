package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Cricket: ImageVector
    get() {
        if (_cricket != null) {
            return _cricket!!
        }
        _cricket = Builder(name = "Cricket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.9f, 82.79f)
                lineTo(189.21f, 30.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.79f, 0.0f)
                lineTo(62.1f, 137.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.79f)
                lineToRelative(22.1f, 22.1f)
                lineTo(35.76f, 227.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(92.69f, 187.8f)
                lineToRelative(22.1f, 22.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.79f, 0.0f)
                lineTo(241.9f, 102.58f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.79f)
                close()
                moveTo(126.1f, 201.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-22.1f, -22.11f)
                lineToRelative(31.07f, -31.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(92.69f, 170.83f)
                lineToRelative(-22.11f, -22.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineToRelative(35.9f, -35.9f)
                lineTo(162.0f, 110.0f)
                verticalLineToRelative(55.52f)
                close()
                moveTo(233.42f, 94.1f)
                lineTo(174.0f, 153.52f)
                lineTo(174.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(118.48f, 98.0f)
                lineTo(177.9f, 38.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f)
                lineToRelative(52.69f, 52.69f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 233.42f, 94.1f)
                close()
                moveTo(60.0f, 86.0f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 34.0f, 60.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 60.0f, 86.0f)
                close()
                moveTo(60.0f, 46.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 46.0f, 60.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 60.0f, 46.0f)
                close()
            }
        }
        .build()
        return _cricket!!
    }

private var _cricket: ImageVector? = null
