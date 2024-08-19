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

public val LightGroup.Personsimplebike: ImageVector
    get() {
        if (_personsimplebike != null) {
            return _personsimplebike!!
        }
        _personsimplebike = Builder(name = "Personsimplebike", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 78.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 78.0f)
                close()
                moveTo(164.0f, 38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 38.0f)
                close()
                moveTo(200.0f, 138.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 200.0f, 138.0f)
                close()
                moveTo(200.0f, 202.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 200.0f, 202.0f)
                close()
                moveTo(56.0f, 138.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 56.0f, 138.0f)
                close()
                moveTo(56.0f, 202.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 56.0f, 202.0f)
                close()
                moveTo(192.0f, 118.0f)
                lineTo(152.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, -1.76f)
                lineTo(120.0f, 88.49f)
                lineTo(96.49f, 112.0f)
                lineToRelative(35.75f, 35.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 152.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 154.49f)
                lineTo(83.76f, 116.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineTo(154.49f, 106.0f)
                lineTo(192.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _personsimplebike!!
    }

private var _personsimplebike: ImageVector? = null
