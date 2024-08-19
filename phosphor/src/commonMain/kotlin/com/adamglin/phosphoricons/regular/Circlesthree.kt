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

public val RegularGroup.Circlesthree: ImageVector
    get() {
        if (_circlesthree != null) {
            return _circlesthree!!
        }
        _circlesthree = Builder(name = "Circlesthree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 172.0f, 76.0f)
                close()
                moveTo(128.0f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 104.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 188.0f, 128.0f)
                close()
                moveTo(188.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 188.0f, 200.0f)
                close()
                moveTo(68.0f, 128.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 68.0f, 128.0f)
                close()
                moveTo(68.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 68.0f, 200.0f)
                close()
            }
        }
        .build()
        return _circlesthree!!
    }

private var _circlesthree: ImageVector? = null
