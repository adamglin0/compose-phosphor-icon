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

public val LightGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 81.65f)
                lineTo(174.35f, 30.1f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -9.9f, -4.1f)
                lineTo(91.55f, 26.0f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -9.9f, 4.1f)
                lineTo(30.1f, 81.65f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, -4.1f, 9.9f)
                verticalLineToRelative(72.9f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 4.1f, 9.9f)
                lineTo(81.65f, 225.9f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(72.9f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(51.55f, -51.55f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 4.1f, -9.9f)
                lineTo(230.0f, 91.55f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 225.9f, 81.65f)
                close()
                moveTo(218.0f, 164.45f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, 1.42f)
                lineToRelative(-51.55f, 51.54f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f)
                lineTo(91.55f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.42f, -0.59f)
                lineTo(38.59f, 165.87f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, -1.42f)
                lineTo(38.0f, 91.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.42f)
                lineTo(90.14f, 38.59f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 91.55f, 38.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.42f, 0.59f)
                lineToRelative(51.54f, 51.55f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, 1.41f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
