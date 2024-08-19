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

public val ThinGroup.Handspraying: ImageVector
    get() {
        if (_handspraying != null) {
            return _handspraying!!
        }
        _handspraying = Builder(name = "Handspraying", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 182.83f)
                lineToRelative(-37.0f, -37.0f)
                lineTo(158.79f, 24.62f)
                arcTo(17.77f, 17.77f, 0.0f, false, false, 128.0f, 18.56f)
                arcToRelative(17.77f, 17.77f, 0.0f, false, false, -30.79f, 6.06f)
                lineTo(60.46f, 145.88f)
                lineToRelative(-36.95f, 37.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(56.2f, 232.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(48.28f, -48.29f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 6.55f, -8.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 6.55f, 8.94f)
                lineToRelative(48.28f, 48.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(32.69f, -32.69f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 182.83f)
                close()
                moveTo(67.49f, 226.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(29.17f, 194.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(44.68f, 173.0f)
                lineTo(83.0f, 211.32f)
                close()
                moveTo(115.78f, 178.55f)
                lineTo(88.68f, 205.66f)
                lineTo(50.34f, 167.32f)
                lineToRelative(16.48f, -16.49f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.0f, -1.67f)
                lineToRelative(37.0f, -122.22f)
                arcTo(9.78f, 9.78f, 0.0f, false, true, 124.0f, 29.78f)
                verticalLineToRelative(129.0f)
                arcTo(27.81f, 27.81f, 0.0f, false, true, 115.8f, 178.55f)
                close()
                moveTo(131.98f, 158.75f)
                verticalLineToRelative(-129.0f)
                arcToRelative(9.78f, 9.78f, 0.0f, false, true, 19.14f, -2.84f)
                lineToRelative(37.0f, 122.22f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.0f, 1.67f)
                lineToRelative(17.38f, 17.38f)
                lineToRelative(-39.18f, 37.51f)
                lineTo(140.2f, 178.55f)
                arcTo(27.81f, 27.81f, 0.0f, false, true, 132.0f, 158.75f)
                close()
                moveTo(226.81f, 194.15f)
                lineTo(194.13f, 226.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(173.0f, 211.38f)
                lineToRelative(39.18f, -37.51f)
                lineToRelative(14.61f, 14.62f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.83f, 194.15f)
                close()
            }
        }
        .build()
        return _handspraying!!
    }

private var _handspraying: ImageVector? = null
