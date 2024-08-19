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

public val ThinGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.56f, 91.07f)
                lineTo(22.25f, 128.0f)
                lineToRelative(44.31f, 36.93f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 172.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.56f, -0.93f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -6.14f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.12f, 6.14f)
                close()
                moveTo(242.56f, 124.93f)
                lineTo(194.56f, 84.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.12f, 6.14f)
                lineTo(233.75f, 128.0f)
                lineToRelative(-44.31f, 36.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.12f, 6.14f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.14f)
                close()
                moveTo(161.37f, 36.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.13f, 2.39f)
                lineToRelative(-64.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 5.13f)
                arcTo(4.12f, 4.12f, 0.0f, false, false, 96.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, -2.63f)
                lineToRelative(64.0f, -176.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 161.37f, 36.24f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
