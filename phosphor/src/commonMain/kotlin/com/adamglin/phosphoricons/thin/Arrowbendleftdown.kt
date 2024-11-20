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

public val ThinGroup.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) {
            return _arrowBendLeftDown!!
        }
        _arrowBendLeftDown = Builder(name = "ArrowBendLeftDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                verticalLineToRelative(86.34f)
                lineToRelative(41.17f, -41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(100.0f, 214.34f)
                verticalLineTo(128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 200.0f, 28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 32.0f)
                close()
            }
        }
        .build()
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
