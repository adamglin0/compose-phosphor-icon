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

public val LightGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 109.21f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.42f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 10.42f)
                close()
                moveTo(128.0f, 46.91f)
                lineTo(227.91f, 104.0f)
                lineTo(128.0f, 161.09f)
                lineTo(28.09f, 104.0f)
                close()
                moveTo(245.21f, 141.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.23f, 8.19f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -10.42f)
                lineToRelative(109.0f, 62.3f)
                lineToRelative(109.0f, -62.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 245.21f, 141.0f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
