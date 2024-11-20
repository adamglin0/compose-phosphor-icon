package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) {
            return _userCircleDashed!!
        }
        _userCircleDashed = Builder(name = "UserCircleDashed", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.26f, 37.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 102.0f, 27.29f)
                arcToRelative(104.11f, 104.11f, 0.0f, false, true, 52.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 15.75f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.0f, -0.26f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -44.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.26f, 37.0f)
                close()
                moveTo(33.35f, 110.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.85f, -5.57f)
                arcToRelative(87.88f, 87.88f, 0.0f, false, true, 22.0f, -38.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 53.8f, 55.14f)
                arcToRelative(103.92f, 103.92f, 0.0f, false, false, -26.0f, 45.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 33.35f, 110.0f)
                close()
                moveTo(150.0f, 213.22f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -44.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, 15.49f)
                arcToRelative(104.11f, 104.11f, 0.0f, false, false, 52.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, -15.49f)
                close()
                moveTo(212.8f, 104.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.42f, -4.28f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -26.0f, -45.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.41f, 11.21f)
                arcTo(88.14f, 88.14f, 0.0f, false, true, 212.79f, 104.45f)
                close()
                moveTo(228.24f, 155.84f)
                arcToRelative(103.68f, 103.68f, 0.0f, false, true, -30.68f, 49.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 185.07f, 203.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -114.14f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.48f, 2.32f)
                arcToRelative(103.74f, 103.74f, 0.0f, false, true, -30.68f, -49.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.42f, -4.27f)
                arcToRelative(87.58f, 87.58f, 0.0f, false, false, 19.0f, 34.88f)
                arcToRelative(79.57f, 79.57f, 0.0f, false, true, 36.1f, -28.77f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.38f, 0.0f)
                arcToRelative(79.57f, 79.57f, 0.0f, false, true, 36.1f, 28.77f)
                arcToRelative(87.58f, 87.58f, 0.0f, false, false, 19.0f, -34.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.42f, 4.28f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
            }
        }
        .build()
        return _userCircleDashed!!
    }

private var _userCircleDashed: ImageVector? = null
