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

public val ThinGroup.Skipforward: ImageVector
    get() {
        if (_skipforward != null) {
            return _skipforward!!
        }
        _skipforward = Builder(name = "Skipforward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(76.44f)
                lineTo(70.31f, 37.84f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.18f, -0.32f)
                arcTo(11.69f, 11.69f, 0.0f, false, false, 52.0f, 47.88f)
                lineTo(52.0f, 208.12f)
                arcToRelative(11.69f, 11.69f, 0.0f, false, false, 6.13f, 10.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.18f, -0.32f)
                lineTo(196.0f, 139.56f)
                lineTo(196.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(204.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 36.0f)
                close()
                moveTo(194.18f, 131.26f)
                lineTo(66.06f, 211.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.06f, 0.11f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.0f, -3.37f)
                lineTo(60.0f, 47.88f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.0f, -3.37f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.11f, 0.62f)
                lineToRelative(128.12f, 80.12f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, true, 0.0f, 6.52f)
                close()
            }
        }
        .build()
        return _skipforward!!
    }

private var _skipforward: ImageVector? = null
