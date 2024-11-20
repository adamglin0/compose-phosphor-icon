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

public val ThinGroup.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(155.87f, 36.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, 3.0f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, true, -1.0f, -0.13f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -46.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -7.74f)
                arcToRelative(100.09f, 100.09f, 0.0f, false, true, 50.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.87f, 36.06f)
                close()
                moveTo(56.65f, 57.94f)
                arcToRelative(100.18f, 100.18f, 0.0f, false, false, -25.0f, 43.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.71f, 2.14f)
                arcToRelative(92.06f, 92.06f, 0.0f, false, true, 23.0f, -39.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.7f, -5.61f)
                close()
                moveTo(39.36f, 152.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.71f, 2.14f)
                arcToRelative(100.08f, 100.08f, 0.0f, false, false, 25.0f, 43.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.71f, -5.61f)
                arcTo(91.91f, 91.91f, 0.0f, false, true, 39.36f, 152.62f)
                close()
                moveTo(151.0f, 217.09f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 7.75f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 50.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.0f, -7.74f)
                close()
                moveTo(221.58f, 149.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.92f, 2.79f)
                arcToRelative(92.12f, 92.12f, 0.0f, false, true, -23.0f, 39.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.7f, 5.61f)
                arcToRelative(100.18f, 100.18f, 0.0f, false, false, 25.0f, -43.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 221.58f, 149.84f)
                close()
                moveTo(216.64f, 103.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.71f, -2.14f)
                arcToRelative(100.08f, 100.08f, 0.0f, false, false, -25.0f, -43.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.71f, 5.61f)
                arcTo(91.91f, 91.91f, 0.0f, false, true, 216.64f, 103.38f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
