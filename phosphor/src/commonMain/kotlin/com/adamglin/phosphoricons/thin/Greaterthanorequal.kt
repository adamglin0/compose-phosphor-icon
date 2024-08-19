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

public val ThinGroup.Greaterthanorequal: ImageVector
    get() {
        if (_greaterthanorequal != null) {
            return _greaterthanorequal!!
        }
        _greaterthanorequal = Builder(name = "Greaterthanorequal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.62f, 156.25f)
                lineTo(196.43f, 104.0f)
                lineTo(54.62f, 51.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.76f, -7.5f)
                lineToRelative(152.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.5f)
                lineToRelative(-152.0f, 56.0f)
                arcTo(3.91f, 3.91f, 0.0f, false, true, 56.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.38f, -7.75f)
                close()
                moveTo(208.0f, 196.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _greaterthanorequal!!
    }

private var _greaterthanorequal: ImageVector? = null
