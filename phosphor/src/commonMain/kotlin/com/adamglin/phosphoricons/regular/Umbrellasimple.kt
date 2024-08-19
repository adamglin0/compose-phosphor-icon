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

public val RegularGroup.Umbrellasimple: ImageVector
    get() {
        if (_umbrellasimple != null) {
            return _umbrellasimple!!
        }
        _umbrellasimple = Builder(name = "Umbrellasimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 126.63f)
                arcTo(112.44f, 112.44f, 0.0f, false, false, 51.75f, 53.75f)
                arcToRelative(111.56f, 111.56f, 0.0f, false, false, -35.7f, 72.88f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 144.0f)
                horizontalLineToRelative(88.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(144.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -17.37f)
                close()
                moveTo(32.0f, 128.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(96.43f, 96.43f, 0.0f, false, true, 193.4f, 65.52f)
                arcTo(95.32f, 95.32f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
        }
        .build()
        return _umbrellasimple!!
    }

private var _umbrellasimple: ImageVector? = null
