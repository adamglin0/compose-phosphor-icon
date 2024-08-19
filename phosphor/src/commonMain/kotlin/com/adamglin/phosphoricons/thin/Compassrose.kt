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

public val ThinGroup.Compassrose: ImageVector
    get() {
        if (_compassrose != null) {
            return _compassrose!!
        }
        _compassrose = Builder(name = "Compassrose", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.0f, 124.12f)
                lineToRelative(-29.68f, -7.42f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, false, -80.0f, -80.0f)
                lineTo(131.88f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.76f, 0.0f)
                lineTo(116.7f, 36.71f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, false, -80.0f, 80.0f)
                lineTo(7.0f, 124.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.76f)
                lineToRelative(29.68f, 7.42f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, false, 80.0f, 80.0f)
                lineTo(124.12f, 249.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.76f, 0.0f)
                lineToRelative(7.42f, -29.68f)
                arcToRelative(91.84f, 91.84f, 0.0f, false, false, 80.0f, -80.0f)
                lineTo(249.0f, 131.88f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.76f)
                close()
                moveTo(210.95f, 114.61f)
                lineTo(155.3f, 100.7f)
                lineTo(141.39f, 45.08f)
                arcTo(83.85f, 83.85f, 0.0f, false, true, 210.92f, 114.61f)
                close()
                moveTo(128.0f, 24.49f)
                lineToRelative(19.57f, 78.28f)
                lineTo(128.0f, 122.34f)
                lineToRelative(-19.57f, -19.57f)
                close()
                moveTo(114.61f, 45.08f)
                lineTo(100.7f, 100.7f)
                lineTo(45.08f, 114.61f)
                arcTo(83.85f, 83.85f, 0.0f, false, true, 114.61f, 45.08f)
                close()
                moveTo(102.77f, 108.43f)
                lineTo(122.34f, 128.0f)
                lineToRelative(-19.57f, 19.57f)
                lineTo(24.49f, 128.0f)
                close()
                moveTo(45.08f, 141.43f)
                lineTo(100.7f, 155.3f)
                lineToRelative(13.91f, 55.62f)
                arcTo(83.85f, 83.85f, 0.0f, false, true, 45.08f, 141.39f)
                close()
                moveTo(128.0f, 231.51f)
                lineToRelative(-19.57f, -78.28f)
                lineTo(128.0f, 133.66f)
                lineToRelative(19.57f, 19.57f)
                close()
                moveTo(141.39f, 210.92f)
                lineTo(155.3f, 155.3f)
                lineToRelative(55.62f, -13.91f)
                arcTo(83.85f, 83.85f, 0.0f, false, true, 141.39f, 210.92f)
                close()
                moveTo(153.23f, 147.57f)
                lineTo(133.66f, 128.0f)
                lineToRelative(19.57f, -19.57f)
                lineTo(231.51f, 128.0f)
                close()
            }
        }
        .build()
        return _compassrose!!
    }

private var _compassrose: ImageVector? = null
