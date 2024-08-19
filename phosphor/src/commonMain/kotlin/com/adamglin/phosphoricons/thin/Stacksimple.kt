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

public val ThinGroup.Stacksimple: ImageVector
    get() {
        if (_stacksimple != null) {
            return _stacksimple!!
        }
        _stacksimple = Builder(name = "Stacksimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 107.47f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.94f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 0.0f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.94f)
                close()
                moveTo(128.0f, 44.61f)
                lineTo(231.94f, 104.0f)
                lineTo(128.0f, 163.39f)
                lineTo(24.06f, 104.0f)
                close()
                moveTo(243.47f, 142.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 5.45f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -6.94f)
                lineToRelative(110.0f, 62.86f)
                lineToRelative(110.0f, -62.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 243.47f, 142.0f)
                close()
            }
        }
        .build()
        return _stacksimple!!
    }

private var _stacksimple: ImageVector? = null
