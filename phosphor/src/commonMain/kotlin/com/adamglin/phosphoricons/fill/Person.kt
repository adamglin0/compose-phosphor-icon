package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = Builder(name = "Person", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 36.0f)
                close()
                moveTo(215.42f, 140.78f)
                lineToRelative(-45.25f, -51.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -21.0f, -9.48f)
                horizontalLineTo(106.83f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -21.0f, 9.48f)
                lineToRelative(-45.25f, 51.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 22.69f)
                lineTo(89.0f, 142.7f)
                lineToRelative(-19.7f, 74.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.08f, 13.35f)
                lineTo(128.0f, 180.0f)
                lineToRelative(29.58f, 51.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 29.08f, -13.35f)
                lineTo(167.0f, 142.7f)
                lineToRelative(25.9f, 20.77f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, -22.69f)
                close()
            }
        }
        .build()
        return _person!!
    }

private var _person: ImageVector? = null
